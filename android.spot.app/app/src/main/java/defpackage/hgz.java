package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgz implements View.OnClickListener {
    public boolean a;
    public final /* synthetic */ hha b;

    public hgz(hha hhaVar) {
        this.b = hhaVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void a() {
        ?? r0 = this.b.d;
        if (r0 != 0) {
            r0.run();
        }
        ijs.e(new hep(this, 9));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Executor qpVar;
        if (this.a) {
            return;
        }
        this.a = true;
        ?? r1 = this.b.c;
        if (r1 != 0) {
            r1.run();
        }
        ?? r12 = this.b.b;
        if (r12 != 0) {
            r12.run();
        }
        view.getContext();
        jyz E = ivc.E(true);
        elj eljVar = new elj(this, view, 4);
        Context context = view.getContext();
        if (Build.VERSION.SDK_INT >= 28) {
            qpVar = bqu.a(context);
        } else {
            qpVar = new qp(new Handler(context.getMainLooper()), 2);
        }
        ivc.N(E, eljVar, qpVar);
    }
}
