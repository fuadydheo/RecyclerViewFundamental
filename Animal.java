package com.example.dheo.SubmissionRecyclerView;

import android.os.Parcel;
import android.os.Parcelable;

// TODO membuat kelas POJO dan lebih baik menggunakan parcelable


// TODO 1.0 deklarasi variable
public class Animal implements Parcelable {
        private String name;
        private String detail;
        private String photo;

// TODO 1.1 Membaut getter dan setter denga cara alt+insert atau klik kanan generate

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
     }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.detail);
        dest.writeString(this.photo);
     }

    public Animal() {
     }

    protected Animal(Parcel in) {
        this.name = in.readString();
        this.detail = in.readString();
        this.photo = in.readString();
     }

    public static final Parcelable.Creator<Animal> CREATOR = new Parcelable.Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel source) {
            return new Animal(source);
         }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
            }
         };
     }
