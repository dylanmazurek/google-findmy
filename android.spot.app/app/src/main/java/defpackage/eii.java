package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eii extends ekl {
    public static final eyw a = new eyw();
    public static final eyv b = new eyv();
    public static final eyy e = new eyy(new efo(3));
    public static final eyz c = new eyz();
    public static final ezb f = new ezb(ifj.class);
    public static final ezb g = new ezb(ekj.class);
    public static final eyu d = new eyu();
    public static final Parcelable.Creator CREATOR = new h(19);

    public eii(jer jerVar, jer jerVar2, jer jerVar3, jer jerVar4, jer jerVar5, ifj ifjVar, ekj ekjVar, jer jerVar6) {
        super(jerVar, jerVar2, jerVar3, jerVar4, jerVar5, ifjVar, ekjVar, jerVar6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        a.d(this.h, parcel);
        b.d(this.i, parcel);
        eyy eyyVar = e;
        eyyVar.d(this.j, parcel);
        eyyVar.d(this.k, parcel);
        c.d(this.l, parcel);
        f.b(this.m, parcel);
        g.b(this.n, parcel);
        d.d(this.o, parcel);
    }
}
