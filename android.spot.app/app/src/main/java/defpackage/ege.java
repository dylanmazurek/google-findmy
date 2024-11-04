package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ege implements efx {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ ege(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.efx
    public final void a(efn efnVar) {
        if (this.b != 0) {
            efnVar.i = this.a;
            efnVar.e(false);
            efnVar.g(false);
            jdl jdlVar = jdl.a;
            efnVar.a = jdlVar;
            efnVar.b = jdlVar;
            return;
        }
        jdl jdlVar2 = jdl.a;
        efnVar.c = jdlVar2;
        efnVar.j = 1;
        efnVar.d = jdlVar2;
        efnVar.i = this.a;
        efnVar.e(false);
        efnVar.g(false);
        jdl jdlVar3 = jdl.a;
        efnVar.a = jdlVar3;
        efnVar.b = jdlVar3;
        efnVar.f(Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
