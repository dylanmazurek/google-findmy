package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new h(5);
    public int a;

    public hn() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public hn(Parcel parcel) {
        this.a = parcel.readInt();
    }
}
