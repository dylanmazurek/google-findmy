package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eza {
    protected abstract jer a(Parcel parcel);

    protected abstract void b(Object obj, Parcel parcel);

    public final jer c(Parcel parcel) {
        if (parcel.readByte() == 0) {
            return jdl.a;
        }
        return a(parcel);
    }

    public final void d(jer jerVar, Parcel parcel) {
        if (jerVar.g()) {
            parcel.writeByte((byte) 1);
            b(jerVar.c(), parcel);
        } else {
            parcel.writeByte((byte) 0);
        }
    }
}
