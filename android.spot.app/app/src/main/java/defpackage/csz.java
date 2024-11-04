package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csz implements crf {
    private final Context a;

    static {
        cqc.a("SystemAlarmScheduler");
    }

    public csz(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.crf
    public final void b(String str) {
        Intent intent = new Intent(this.a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        this.a.startService(intent);
    }

    @Override // defpackage.crf
    public final void c(cvu... cvuVarArr) {
        for (cvu cvuVar : cvuVarArr) {
            cqc.b();
            String str = cvuVar.b;
            this.a.startService(csr.d(this.a, cuv.b(cvuVar)));
        }
    }

    @Override // defpackage.crf
    public final boolean d() {
        return true;
    }
}
