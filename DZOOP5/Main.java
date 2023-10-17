package DZOOP5;

import DZOOP5.models.TableModel;
import DZOOP5.presenters.BookingPresenter;
import DZOOP5.presenters.Model;
import DZOOP5.presenters.View;
import DZOOP5.views.Views;

import java.util.Date;

public class Main {

    /**
     * Программа выполняет бронирование столика номер 2, после чего бронь отменяется и создается новая на новую дату и другой столик
     * @param args
     */
    public static void main(String[] args) {

        Model tableModel = new TableModel();
        View bookingView = new Views();
        BookingPresenter presenter = new BookingPresenter(tableModel, bookingView);
        presenter.updateUIShowTables();

        tableModel.printAllReservation();

        bookingView.reservationTable(new Date(), 2, "Станислав");

        tableModel.printAllReservation();

        bookingView.changeReservationTable(1001, new Date(), 3, "Станислав");

        tableModel.printAllReservation();

        bookingView.reservationTable(new Date(), 2, "Алексей");

        tableModel.printAllReservation();
    }

}