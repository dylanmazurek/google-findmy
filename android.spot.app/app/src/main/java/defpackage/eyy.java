package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyy extends eza {
    private final eyx a;

    public eyy(eyx eyxVar) {
        this.a = eyxVar;
    }

    @Override // defpackage.eza
    protected final jer a(Parcel parcel) {
        byte[] bF = fma.bF(parcel);
        try {
            eyx eyxVar = this.a;
            lja ljaVar = lja.a;
            lkz lkzVar = lkz.a;
            return jer.i(eyxVar.a(bF, lja.a));
        } catch (ljy unused) {
            return jdl.a;
        }
    }

    @Override // defpackage.eza
    public final /* synthetic */ void b(Object obj, Parcel parcel) {
        fma.bD(parcel, (lkq) obj);
    }

    public eyy() {
        this(new efo(1));
    }
}
