package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class crj extends mnp implements mon {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ long c;

    public crj(mmx mmxVar) {
        super(4, mmxVar);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mne mneVar = mne.a;
        int i = this.a;
        mjo.o(obj);
        if (i == 0) {
            Object obj2 = this.b;
            long j = this.c;
            cqc.b();
            Log.e(crl.a, "Cannot check for unfinished work", (Throwable) obj2);
            long min = Math.min(j * 30000, crl.b);
            this.a = 1;
            if (msz.i(min, this) == mneVar) {
                return mneVar;
            }
        }
        return true;
    }

    @Override // defpackage.mon
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        crj crjVar = new crj((mmx) obj4);
        crjVar.b = (Throwable) obj2;
        crjVar.c = longValue;
        return crjVar.b(mlh.a);
    }
}
