package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezb {
    public final Class a;

    public ezb(Class cls) {
        this.a = cls;
    }

    public final Enum a(Parcel parcel) {
        return (Enum) new jeg(this.a).e(ivc.n(parcel.readString()));
    }

    public final void b(Enum r3, Parcel parcel) {
        parcel.writeString((String) new jeg(this.a).f().e(r3));
    }

    public ezb() {
        this(ekj.class);
    }
}
