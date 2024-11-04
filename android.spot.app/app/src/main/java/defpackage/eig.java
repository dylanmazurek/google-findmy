package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eig extends eit {
    public static final eyy b = new eyy(new efo(2));
    public static final eyw a = new eyw();
    public static final Parcelable.Creator CREATOR = new h(17);

    public eig(jer jerVar, jer jerVar2, jer jerVar3, jer jerVar4, int i, boolean z, boolean z2) {
        super(jerVar, jerVar2, jerVar3, jerVar4, i, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b.d(this.d, parcel);
        eyw eywVar = a;
        eywVar.d(this.e, parcel);
        eywVar.d(this.f, parcel);
        eywVar.d(this.g, parcel);
        parcel.writeString(hwx.c(this.j));
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
