package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iss implements Parcelable {
    public static final Parcelable.Creator CREATOR = new inw(2);
    int a;
    irq b;

    public iss() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, 0);
    }

    public iss(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = (irq) parcel.readParcelable(getClass().getClassLoader());
    }
}
