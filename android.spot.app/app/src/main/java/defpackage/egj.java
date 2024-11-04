package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class egj implements efx {
    private final /* synthetic */ int a;

    @Override // defpackage.efx
    public final void a(efn efnVar) {
        switch (this.a) {
            case 0:
                jdl jdlVar = jdl.a;
                efnVar.g = jdlVar;
                efnVar.h = jdlVar;
                efnVar.e = jdlVar;
                efnVar.f = jdlVar;
                return;
            case 1:
                jdl jdlVar2 = jdl.a;
                efnVar.a = jdlVar2;
                efnVar.b = jdlVar2;
                return;
            case 2:
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long c = ltl.c() + elapsedRealtime;
                efnVar.g = jer.i(Long.valueOf(elapsedRealtime));
                efnVar.h = jer.i(Long.valueOf(c));
                jdl jdlVar3 = jdl.a;
                efnVar.e = jdlVar3;
                efnVar.f = jdlVar3;
                return;
            case 3:
                jdl jdlVar4 = jdl.a;
                efnVar.e = jdlVar4;
                efnVar.f = jdlVar4;
                return;
            case 4:
                jdl jdlVar5 = jdl.a;
                efnVar.g = jdlVar5;
                efnVar.h = jdlVar5;
                efnVar.e = jdlVar5;
                efnVar.f = jdlVar5;
                return;
            case 5:
                efnVar.i(true);
                return;
            case 6:
                efnVar.i(true);
                return;
            default:
                efnVar.i(true);
                return;
        }
    }
}
