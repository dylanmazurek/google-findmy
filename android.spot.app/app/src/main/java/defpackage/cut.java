package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cut implements ctl, cqs {
    public static final String a = cqc.a("SystemFgDispatcher");
    public final csb b;
    public final Object c = new Object();
    cvk d;
    final Map e;
    public final Map f;
    public final Map g;
    public cus h;
    public final eld i;
    public final bet j;
    private final Context k;

    public cut(Context context) {
        this.k = context;
        csb f = csb.f(context);
        this.b = f;
        this.i = f.i;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.j = new bet(f.k);
        f.e.c(this);
    }

    @Override // defpackage.cqs
    public final void a(cvk cvkVar, boolean z) {
        muf mufVar;
        Map.Entry entry;
        synchronized (this.c) {
            if (((cvu) this.f.remove(cvkVar)) != null) {
                mufVar = (muf) this.g.remove(cvkVar);
            } else {
                mufVar = null;
            }
            if (mufVar != null) {
                mufVar.s(null);
            }
        }
        cpt cptVar = (cpt) this.e.remove(cvkVar);
        if (cvkVar.equals(this.d)) {
            if (this.e.size() > 0) {
                Iterator it = this.e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (cvk) entry.getKey();
                if (this.h != null) {
                    cpt cptVar2 = (cpt) entry.getValue();
                    this.h.c(cptVar2.a, cptVar2.b, cptVar2.c);
                    this.h.a(cptVar2.a);
                }
            } else {
                this.d = null;
            }
        }
        cus cusVar = this.h;
        if (cptVar != null && cusVar != null) {
            cqc.b();
            int i = cptVar.a;
            Objects.toString(cvkVar);
            int i2 = cptVar.b;
            cusVar.a(cptVar.a);
        }
    }

    public final void b(Intent intent) {
        if (this.h != null) {
            int i = 0;
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            cvk cvkVar = new cvk(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            cqc.b();
            if (notification != null) {
                cpt cptVar = new cpt(intExtra, notification, intExtra2);
                this.e.put(cvkVar, cptVar);
                cpt cptVar2 = (cpt) this.e.get(this.d);
                if (cptVar2 == null) {
                    this.d = cvkVar;
                } else {
                    this.h.b(intExtra, notification);
                    if (Build.VERSION.SDK_INT >= 29) {
                        Iterator it = this.e.entrySet().iterator();
                        while (it.hasNext()) {
                            i |= ((cpt) ((Map.Entry) it.next()).getValue()).b;
                        }
                        cptVar = new cpt(cptVar2.a, cptVar2.c, i);
                    } else {
                        cptVar = cptVar2;
                    }
                }
                this.h.c(cptVar.a, cptVar.b, cptVar.c);
                return;
            }
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
    }

    public final void c() {
        this.h = null;
        synchronized (this.c) {
            Iterator it = this.g.values().iterator();
            while (it.hasNext()) {
                ((muf) it.next()).s(null);
            }
        }
        this.b.e.d(this);
    }

    @Override // defpackage.ctl
    public final void e(cvu cvuVar, ctd ctdVar) {
        if (ctdVar instanceof cth) {
            cqc.b();
            csb csbVar = this.b;
            cvk b = cuv.b(cvuVar);
            eld eldVar = csbVar.i;
            crd crdVar = csbVar.e;
            bet betVar = new bet(b);
            crdVar.getClass();
            eldVar.e(new cxe(crdVar, betVar, true, -512));
        }
    }
}
