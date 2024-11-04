package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csr implements cqs {
    public static final String a = cqc.a("CommandHandler");
    public final Context b;
    public final Map c = new HashMap();
    public final Object d = new Object();
    public final elo e;

    public csr(Context context, elo eloVar) {
        this.b = context;
        this.e = eloVar;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent c(Context context, cvk cvkVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        f(intent, cvkVar);
        return intent;
    }

    public static Intent d(Context context, cvk cvkVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        f(intent, cvkVar);
        return intent;
    }

    public static cvk e(Intent intent) {
        return new cvk(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void f(Intent intent, cvk cvkVar) {
        intent.putExtra("KEY_WORKSPEC_ID", cvkVar.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", cvkVar.b);
    }

    @Override // defpackage.cqs
    public final void a(cvk cvkVar, boolean z) {
        synchronized (this.d) {
            csu csuVar = (csu) this.c.remove(cvkVar);
            this.e.G(cvkVar);
            if (csuVar != null) {
                cqc.b();
                Objects.toString(csuVar.c);
                csuVar.a();
                if (z) {
                    csuVar.g.execute(new csw(csuVar.d, d(csuVar.a, csuVar.c), csuVar.b));
                }
                if (csuVar.i) {
                    csuVar.g.execute(new csw(csuVar.d, b(csuVar.a), csuVar.b));
                }
            }
        }
    }
}
