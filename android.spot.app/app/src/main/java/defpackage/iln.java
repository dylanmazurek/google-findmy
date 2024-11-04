package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iln extends imh {
    public static final imh a = new iln();

    private iln() {
    }

    @Override // defpackage.imh
    public final String a() {
        return "multiproc";
    }

    @Override // defpackage.imh
    public final /* synthetic */ img b(ilu iluVar, String str, Executor executor, kpb kpbVar) {
        lja ljaVar;
        hwx.J(iluVar.e instanceof ill);
        if (iluVar.f) {
            ljaVar = lja.a();
        } else {
            lja ljaVar2 = lja.a;
            lkz lkzVar = lkz.a;
            ljaVar = lja.a;
        }
        imj imjVar = new imj(iluVar.b, ljaVar);
        Uri uri = iluVar.a;
        return new ilp(str, ivc.E(uri), imjVar, executor, kpbVar, iluVar.c);
    }
}
