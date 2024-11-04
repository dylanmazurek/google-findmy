package com.google.android.gms.people.internal;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fvq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MatrixCursorParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new fvq(10);
    private final Cursor a;
    private final int b;

    public MatrixCursorParcelable(Cursor cursor) {
        int count;
        this.a = cursor;
        if (cursor == null) {
            count = 0;
        } else {
            count = cursor.getCount();
        }
        this.b = count;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Cursor cursor = this.a;
        if (cursor != null) {
            try {
                int columnCount = cursor.getColumnCount();
                parcel.writeInt(columnCount);
                parcel.writeStringArray(this.a.getColumnNames());
                parcel.writeInt(this.b);
                this.a.moveToPosition(-1);
                while (this.a.moveToNext()) {
                    Object[] objArr = new Object[columnCount];
                    for (int i2 = 0; i2 < columnCount; i2++) {
                        int type = this.a.getType(i2);
                        if (type != 0) {
                            if (type != 1) {
                                if (type != 2) {
                                    if (type != 3) {
                                        if (type == 4) {
                                            objArr[i2] = this.a.getBlob(i2);
                                        }
                                    } else {
                                        objArr[i2] = this.a.getString(i2);
                                    }
                                } else {
                                    objArr[i2] = Float.valueOf(this.a.getFloat(i2));
                                }
                            } else {
                                objArr[i2] = Integer.valueOf(this.a.getInt(i2));
                            }
                        } else {
                            objArr[i2] = null;
                        }
                    }
                    parcel.writeArray(objArr);
                }
                return;
            } finally {
                this.a.close();
            }
        }
        parcel.writeInt(0);
        parcel.writeStringArray(new String[0]);
        parcel.writeInt(0);
    }
}
