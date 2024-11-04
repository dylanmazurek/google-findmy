package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilx extends imh {
    public static final imh a = new ilx();

    private ilx() {
    }

    @Override // defpackage.imh
    public final String a() {
        return "signal";
    }

    @Override // defpackage.imh
    public final /* synthetic */ img b(ilu iluVar, String str, Executor executor, kpb kpbVar) {
        lja ljaVar;
        hwx.J(iluVar.e instanceof ilw);
        if (iluVar.f) {
            ljaVar = lja.a();
        } else {
            lja ljaVar2 = lja.a;
            lkz lkzVar = lkz.a;
            ljaVar = lja.a;
        }
        imj imjVar = new imj(iluVar.b, ljaVar);
        imd imdVar = iluVar.e;
        Uri uri = iluVar.a;
        return new ilz(str, ivc.E(uri), imjVar, executor, kpbVar, ((ilw) imdVar).a, iluVar.c);
    }
}
