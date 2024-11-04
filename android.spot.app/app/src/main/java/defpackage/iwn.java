package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwn {
    private static iwn e;
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;

    public iwn(Context context, ExecutorService executorService) {
        this.b = context;
        this.a = executorService;
    }

    public static iwn a() {
        if (e == null) {
            e = new iwn();
        }
        return e;
    }

    public final void b(iwm iwmVar) {
        int i = iwmVar.a;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            if (i == -1) {
                i = 1500;
            } else {
                i = 2750;
            }
        }
        ((Handler) this.b).removeCallbacksAndMessages(iwmVar);
        Handler handler = (Handler) this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, iwmVar), i);
    }

    public final void c() {
        Object obj = this.d;
        if (obj != null) {
            this.c = obj;
            this.d = null;
            njz njzVar = (njz) ((WeakReference) ((iwm) obj).c).get();
            if (njzVar != null) {
                Object obj2 = njzVar.a;
                Handler handler = iwh.a;
                handler.sendMessage(handler.obtainMessage(0, obj2));
                return;
            }
            this.c = null;
        }
    }

    public final boolean d(iwm iwmVar, int i) {
        njz njzVar = (njz) ((WeakReference) iwmVar.c).get();
        if (njzVar == null) {
            return false;
        }
        ((Handler) this.b).removeCallbacksAndMessages(iwmVar);
        Object obj = njzVar.a;
        Handler handler = iwh.a;
        handler.sendMessage(handler.obtainMessage(1, i, 0, obj));
        return true;
    }

    public final void e(njz njzVar) {
        synchronized (this.a) {
            if (g(njzVar)) {
                Object obj = this.c;
                if (!((iwm) obj).b) {
                    ((iwm) obj).b = true;
                    ((Handler) this.b).removeCallbacksAndMessages(obj);
                }
            }
        }
    }

    public final void f(njz njzVar) {
        synchronized (this.a) {
            if (g(njzVar)) {
                Object obj = this.c;
                if (((iwm) obj).b) {
                    ((iwm) obj).b = false;
                    b((iwm) obj);
                }
            }
        }
    }

    public final boolean g(njz njzVar) {
        Object obj = this.c;
        if (obj != null && ((iwm) obj).a(njzVar)) {
            return true;
        }
        return false;
    }

    public final boolean h(njz njzVar) {
        Object obj = this.d;
        if (obj != null && ((iwm) obj).a(njzVar)) {
            return true;
        }
        return false;
    }

    private iwn() {
        this.a = new Object();
        this.b = new Handler(Looper.getMainLooper(), new iwl(this));
    }
}
