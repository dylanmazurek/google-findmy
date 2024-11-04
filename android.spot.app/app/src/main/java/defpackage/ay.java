package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ay implements Parcelable {
    public static final Parcelable.Creator CREATOR = new h(2);
    final String a;
    final int b;

    public ay(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }

    public ay(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }
}
