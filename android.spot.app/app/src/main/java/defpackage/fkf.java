package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fkf extends fkh {
    public final int a;
    public final Bundle b;
    final /* synthetic */ fkn c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkf(fkn fknVar, int i, Bundle bundle) {
        super(fknVar, true);
        this.c = fknVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(ConnectionResult connectionResult);

    protected abstract boolean c();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkh
    public final /* bridge */ /* synthetic */ void d() {
        PendingIntent pendingIntent = null;
        if (this.a != 0) {
            this.c.M(1, null);
            Bundle bundle = this.b;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            a(new ConnectionResult(this.a, pendingIntent));
            return;
        }
        if (!c()) {
            this.c.M(1, null);
            a(new ConnectionResult(8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkh
    public final void b() {
    }
}
