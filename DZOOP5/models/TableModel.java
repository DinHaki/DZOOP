package DZOOP5.models;

import DZOOP5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    public void printAllReservation(){
        for (Table table: loadTables()) {
            Collection<Reserv> reservations = table.getReservations();
            if (reservations.size() > 0)
                System.out.println(reservations);
        }
    }

    private boolean cancelReservation(int reservationId){
        for (Table table: loadTables()) {
            Collection<Reserv> reservations = table.getReservations();

            for (Reserv reservation: reservations) {
                if (reservation.getId() == reservationId) {
                    reservations.remove(reservation);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Получение списка всех столиков
     */
    @Override
    public Collection<Table> loadTables() {

        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param name Имя
     */
    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table: loadTables()) {
            if (table.getNo() == tableNo){
                Reserv reservation = new Reserv(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    /**
     * Отмена бронирования по старому номеру бронирования и создание нового бронирования
     * @param oldReservation
     * @param reservationDate
     * @param tableNo
     * @param name
     * @return
     */
    @Override
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        boolean cancel = cancelReservation(oldReservation);

        if (cancel) {
            int newReservationId = reservationTable(reservationDate, tableNo, name);
            return newReservationId;
        }

        return -1;

    }

}