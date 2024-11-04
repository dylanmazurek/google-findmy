package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eih extends eiv {
    public static final eyw a = new eyw();
    public static final eyz b = new eyz();
    public static final eyt c = new eyt(null);
    public static final Parcelable.Creator CREATOR = new h(18);

    public eih(jer jerVar, boolean z, jer jerVar2, Boolean bool, jiy jiyVar, jer jerVar3) {
        super(jerVar, z, jerVar2, bool, jiyVar, jerVar3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        a.d(this.d, parcel);
        parcel.writeInt(this.e ? 1 : 0);
        b.d(this.f, parcel);
        parcel.writeInt(this.g.booleanValue() ? 1 : 0);
        jiy jiyVar = this.h;
        eyt eytVar = c;
        parcel.writeInt(jiyVar.size());
        jmw listIterator = jiyVar.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            ((ezb) eytVar.b).b((Enum) entry.getKey(), parcel);
            parcel.writeParcelable((Parcelable) entry.getValue(), 0);
        }
        a.d(this.i, parcel);
    }
}
