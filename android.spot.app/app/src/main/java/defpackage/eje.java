package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eje implements els {
    private final /* synthetic */ int a;

    public /* synthetic */ eje(int i) {
        this.a = i;
    }

    @Override // defpackage.els
    public final void a(eiu eiuVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                eiuVar.e = jer.i(Long.valueOf(SystemClock.elapsedRealtime()));
                return;
            }
            jnk jnkVar = ejg.a;
            eiuVar.d(true);
            eiuVar.c = jdl.a;
            return;
        }
        jnk jnkVar2 = ejg.a;
        eiuVar.d(false);
        eiuVar.c = jdl.a;
    }
}
