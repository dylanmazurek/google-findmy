package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grn implements lsh {
    private final mko a;
    private final mko b;
    private final /* synthetic */ int c;

    public grn(mko mkoVar, mko mkoVar2, int i) {
        this.c = i;
        this.a = mkoVar;
        this.b = mkoVar2;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        if (this.c != 0) {
            return b();
        }
        return b();
    }

    public final Boolean b() {
        boolean z = false;
        if (this.c != 0) {
            return (Boolean) ((jer) ((lsi) this.b).b).e((Boolean) ((jer) ((lsi) this.a).b).e(false));
        }
        Context b = ((lry) this.a).b();
        gwc gwcVar = new gwc();
        gnv gnvVar = (gnv) this.b.a();
        gnvVar.getClass();
        gwcVar.a(b);
        if (lvs.a.a().c() && gnvVar.j) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public grn(mko mkoVar, mko mkoVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = mkoVar;
        this.a = mkoVar2;
    }
}
