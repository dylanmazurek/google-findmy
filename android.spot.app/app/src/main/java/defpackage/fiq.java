package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fiq implements Runnable {
    public final Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public fiq(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.content.DialogInterface$OnCancelListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.DialogInterface$OnCancelListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        gf gfVar;
        int i = this.c;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                mjc mjcVar = (mjc) this.b;
                mja b = mjcVar.b(mjcVar.q.e, false);
                if (b == null) {
                    return;
                }
                ((mjc) this.b).f.execute(new miy(this, b, 1));
                return;
            }
            gh ghVar = ((ho) this.b).c;
            if (ghVar != null && (gfVar = ghVar.b) != null) {
                gfVar.F(ghVar);
            }
            View view = (View) ((ho) this.b).f;
            if (view != null && view.getWindowToken() != null && ((gr) this.a).h()) {
                ((ho) this.b).j = (hm) this.a;
            }
            ((ho) this.b).m = null;
            return;
        }
        if (((fir) this.b).a) {
            ConnectionResult connectionResult = (ConnectionResult) ((kvw) this.a).b;
            if (connectionResult.a()) {
                Object obj = this.b;
                PendingIntent pendingIntent = connectionResult.d;
                Activity l = ((fjj) obj).l();
                fma.aR(pendingIntent);
                ((fir) obj).f.startActivityForResult(GoogleApiActivity.a(l, pendingIntent, ((kvw) this.a).a, false), 1);
                return;
            }
            Object obj2 = this.b;
            if (((fir) obj2).d.h(((fjj) obj2).l(), connectionResult.c, null) != null) {
                ?? r1 = this.b;
                int i3 = connectionResult.c;
                Activity l2 = ((fjj) r1).l();
                fir firVar = (fir) r1;
                fgp fgpVar = firVar.d;
                Dialog c = fgpVar.c(l2, i3, new fks(fgpVar.h(l2, i3, "d"), firVar.f), r1);
                if (c != null) {
                    fgpVar.b(l2, c, "GooglePlayServicesErrorDialog", r1);
                    return;
                }
                return;
            }
            if (connectionResult.c == 18) {
                ?? r0 = this.b;
                Activity l3 = ((fjj) r0).l();
                ProgressBar progressBar = new ProgressBar(l3, null, R.attr.progressBarStyleLarge);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(l3);
                builder.setView(progressBar);
                builder.setMessage(fkq.c(l3, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                ((fir) r0).d.b(l3, create, "GooglePlayServicesUpdatingDialog", r0);
                Context applicationContext = ((fjj) this.b).l().getApplicationContext();
                hjq hjqVar = new hjq(this, create);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                fjg fjgVar = new fjg(hjqVar);
                if (frx.o()) {
                    if (true == frx.o()) {
                        i2 = 2;
                    }
                    applicationContext.registerReceiver(fjgVar, intentFilter, i2);
                } else {
                    applicationContext.registerReceiver(fjgVar, intentFilter);
                }
                fjgVar.a = applicationContext;
                if (!fhd.h(applicationContext)) {
                    hjqVar.d();
                    fjgVar.a();
                    return;
                }
                return;
            }
            ((fir) this.b).a(connectionResult, ((kvw) this.a).a);
        }
    }
}
