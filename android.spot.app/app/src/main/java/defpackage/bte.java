package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bte {
    static void a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    static void b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    static void c(String str, long j) {
        Trace.setCounter(str, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d() {
        boolean isEnabled;
        isEnabled = Trace.isEnabled();
        return isEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(Activity activity, cev cevVar) {
        cevVar.getClass();
        if (activity instanceof cfe) {
            ((cfe) activity).a().b(cevVar);
        } else if (activity instanceof cfc) {
            cex N = ((cfc) activity).N();
            if (N instanceof cex) {
                N.b(cevVar);
            }
        }
    }

    public static final void f(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            cfu cfuVar = cfv.Companion;
            cfu.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new cfw(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
