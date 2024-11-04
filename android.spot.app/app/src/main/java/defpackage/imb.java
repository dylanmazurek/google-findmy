package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imb extends imh {
    public static final imh a = new imb();

    private imb() {
    }

    @Override // defpackage.imh
    public final String a() {
        return "singleproc";
    }

    @Override // defpackage.imh
    public final /* synthetic */ img b(ilu iluVar, String str, Executor executor, kpb kpbVar) {
        lja ljaVar;
        if (iluVar.f) {
            ljaVar = lja.a();
        } else {
            lja ljaVar2 = lja.a;
            lkz lkzVar = lkz.a;
            ljaVar = lja.a;
        }
        imj imjVar = new imj(iluVar.b, ljaVar);
        Uri uri = iluVar.a;
        return new imc(str, ivc.E(uri), imjVar, executor, kpbVar, iluVar.c);
    }
}
