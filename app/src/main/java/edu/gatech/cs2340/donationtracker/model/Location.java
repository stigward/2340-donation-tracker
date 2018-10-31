package edu.gatech.cs2340.donationtracker.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

public class Location {
    private String _name;
    private double _latitude;
    private double _longitude;
    private String _streetAddress;
    private String _city;
    private String _state;
    private int _zip;
    private String _type;
    private String _phone_number;
    private String _website;
    private List<DonationItem> _items;

    public Location(String name, double latitude, double longitude, String streetAddress, String city, String state, int zip, String locationType, String phoneNumber, String website) {
        _name = name;
        _latitude = latitude;
        _longitude = longitude;
        _streetAddress = streetAddress;
        _city = city;
        _state = state;
        _zip = zip;
        _type = locationType;
        _phone_number = phoneNumber;
        _website = website;
    }

    public String get_name() {
        return _name;
    }

    public double get_latitude() {
        return _latitude;
    }

    public double get_longitude() {
        return _longitude;
    }

    public String get_streetAddress() {
        return _streetAddress;
    }

    public String get_state() {
        return _state;
    }

    public String get_city() {
        return _city;
    }

    public int get_zip() {
        return _zip;
    }

    public String get_type() {
        return _type;
    }

    public String get_phone_number() {
        return _phone_number;
    }

    public String get_website() {
        return _website;
    }

    public List<DonationItem> getItems() {
        return _items;
    }

    public void addItem(DonationItem item) {
        _items.add(item);
    }

    public void removeItem(DonationItem item) {
        _items.remove(item);
    }

}
