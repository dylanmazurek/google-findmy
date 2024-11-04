package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efz extends een {
    public static final eyy t = new eyy(new efo(1));
    public static final eyy u = new eyy(new efo(0));
    public static final eyw r = new eyw();
    public static final eyz s = new eyz();
    public static final Parcelable.Creator CREATOR = new h(16);

    public efz(eiv eivVar, ekl eklVar, jer jerVar, boolean z, boolean z2, boolean z3, jer jerVar2, jer jerVar3, int i, boolean z4, jer jerVar4, int i2, jer jerVar5, jer jerVar6, jer jerVar7, jer jerVar8, jer jerVar9) {
        super(eivVar, eklVar, jerVar, z, z2, z3, jerVar2, jerVar3, i, z4, jerVar4, i2, jerVar5, jerVar6, jerVar7, jerVar8, jerVar9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeSerializable(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeSerializable(this.g);
        t.d(this.h, parcel);
        parcel.writeString(bsf.d(this.p));
        parcel.writeInt(this.i ? 1 : 0);
        u.d(this.j, parcel);
        parcel.writeString(bsf.c(this.q));
        eyw eywVar = r;
        eywVar.d(this.k, parcel);
        eyz eyzVar = s;
        eyzVar.d(this.l, parcel);
        eyzVar.d(this.m, parcel);
        eywVar.d(this.n, parcel);
        eywVar.d(this.o, parcel);
    }
}
