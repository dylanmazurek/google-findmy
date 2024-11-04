package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyv extends eza {
    @Override // defpackage.eza
    protected final jer a(Parcel parcel) {
        return jer.i(Integer.valueOf(parcel.readInt()));
    }

    @Override // defpackage.eza
    public final /* bridge */ /* synthetic */ void b(Object obj, Parcel parcel) {
        parcel.writeInt(((Integer) obj).intValue());
    }
}
