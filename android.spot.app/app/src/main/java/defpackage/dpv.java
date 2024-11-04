package defpackage;

import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpv implements dix {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public dpv(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [dln, java.lang.Object] */
    @Override // defpackage.dix
    public final /* synthetic */ dlf a(Object obj, int i, int i2, div divVar) {
        dpt dptVar;
        boolean z;
        dtg dtgVar;
        if (this.a != 0) {
            dlf c = ((dqk) this.b).c((Uri) obj, divVar);
            if (c == null) {
                return null;
            }
            return dph.a(this.c, ((dqi) c).c(), i, i2);
        }
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof dpt) {
            dptVar = (dpt) inputStream;
            z = false;
        } else {
            dptVar = new dpt(inputStream, (dlu) this.c);
            z = true;
        }
        synchronized (dtg.a) {
            dtgVar = (dtg) dtg.a.poll();
        }
        if (dtgVar == null) {
            dtgVar = new dtg();
        }
        dtgVar.b = dptVar;
        dtn dtnVar = new dtn(dtgVar);
        dpu dpuVar = new dpu(dptVar, dtgVar);
        try {
            Object obj2 = this.b;
            dlf a = ((dpf) obj2).a(new dpp(dtnVar, ((dpf) obj2).f, ((dpf) obj2).g, 0), i, i2, divVar, dpuVar);
            dtgVar.a();
            if (z) {
                dptVar.b();
            }
            return a;
        } catch (Throwable th) {
            dtgVar.a();
            if (z) {
                dptVar.b();
            }
            throw th;
        }
    }

    @Override // defpackage.dix
    public final /* synthetic */ boolean b(Object obj, div divVar) {
        if (this.a != 0) {
            return "android.resource".equals(((Uri) obj).getScheme());
        }
        return true;
    }
}
