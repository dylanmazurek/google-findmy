package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbk implements frh, frj, fri {
    public final frk a;
    public final Map b;

    public lbk(frk frkVar) {
        new HashMap();
        this.b = new HashMap();
        this.a = frkVar;
        new Handler(Looper.getMainLooper()).post(new jxe(this, 19, null));
    }

    public static /* synthetic */ void e(Object obj) {
        try {
            fsf fsfVar = ((fsa) obj).a;
            fsfVar.c(1, fsfVar.a());
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }

    @Override // defpackage.frh
    public final void a(fsa fsaVar) {
        frh frhVar;
        lbj lbjVar = (lbj) this.b.get(fsaVar);
        if (lbjVar != null && (frhVar = lbjVar.c) != null) {
            frhVar.a(fsaVar);
        }
    }

    @Override // defpackage.fri
    public final void b(fsa fsaVar) {
        fri friVar;
        lbj lbjVar = (lbj) this.b.get(fsaVar);
        if (lbjVar != null && (friVar = lbjVar.d) != null) {
            friVar.b(fsaVar);
        }
    }

    @Override // defpackage.frj
    public final void c(fsa fsaVar) {
        frj frjVar;
        lbj lbjVar = (lbj) this.b.get(fsaVar);
        if (lbjVar != null && (frjVar = lbjVar.e) != null) {
            frjVar.c(fsaVar);
        }
    }

    public final void d(Object obj) {
        lbj lbjVar = (lbj) this.b.get(obj);
        if (lbjVar != null && lbjVar.a.remove(obj)) {
            lbjVar.b.b.remove(obj);
            e(obj);
        }
    }
}
