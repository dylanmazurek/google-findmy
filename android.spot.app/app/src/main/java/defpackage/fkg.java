package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkg extends fqw {
    final /* synthetic */ fkn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkg(fkn fknVar, Looper looper) {
        super(looper);
        this.a = fknVar;
    }

    private static final void a(Message message) {
        fkh fkhVar = (fkh) message.obj;
        fkhVar.b();
        fkhVar.f();
    }

    private static final boolean b(Message message) {
        if (message.what == 2 || message.what == 1 || message.what == 7) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [fiv, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        if (this.a.n.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what != 1 && message.what != 7 && message.what != 4 && message.what != 5) || this.a.n()) {
            PendingIntent pendingIntent = null;
            if (message.what == 4) {
                this.a.k = new ConnectionResult(message.arg2);
                fkn fknVar = this.a;
                if (!fknVar.l && !TextUtils.isEmpty(fknVar.c()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(fknVar.c());
                        fkn fknVar2 = this.a;
                        if (!fknVar2.l) {
                            fknVar2.M(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                ConnectionResult connectionResult = this.a.k;
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(8);
                }
                this.a.f.a(connectionResult);
                System.currentTimeMillis();
                return;
            }
            if (message.what == 5) {
                ConnectionResult connectionResult2 = this.a.k;
                if (connectionResult2 == null) {
                    connectionResult2 = new ConnectionResult(8);
                }
                this.a.f.a(connectionResult2);
                System.currentTimeMillis();
                return;
            }
            if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                this.a.f.a(new ConnectionResult(message.arg2, pendingIntent));
                System.currentTimeMillis();
                return;
            }
            if (message.what == 6) {
                this.a.M(5, null);
                njz njzVar = this.a.r;
                if (njzVar != null) {
                    njzVar.a.a(message.arg2);
                }
                fkn fknVar3 = this.a;
                int i = message.arg2;
                fknVar3.H();
                this.a.A(5, 1, null);
                return;
            }
            if (message.what == 2 && !this.a.m()) {
                a(message);
                return;
            }
            if (b(message)) {
                fkh fkhVar = (fkh) message.obj;
                synchronized (fkhVar) {
                    obj = fkhVar.d;
                    if (fkhVar.e) {
                        Log.w("GmsClient", der.c(fkhVar, "Callback proxy ", " being reused. This is not safe."));
                    }
                }
                if (obj != null) {
                    fkhVar.d();
                }
                synchronized (fkhVar) {
                    fkhVar.e = true;
                }
                fkhVar.f();
                return;
            }
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        a(message);
    }
}
