package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyw extends eza {
    @Override // defpackage.eza
    protected final jer a(Parcel parcel) {
        return jer.i(Long.valueOf(parcel.readLong()));
    }

    @Override // defpackage.eza
    public final /* bridge */ /* synthetic */ void b(Object obj, Parcel parcel) {
        parcel.writeLong(((Long) obj).longValue());
    }
}
