package defpackage;

import android.os.Build;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eek extends mpe implements moh {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eek(cqb cqbVar, boolean z, String str, csl cslVar, int i) {
        super(1);
        this.e = i;
        this.b = cqbVar;
        this.a = z;
        this.d = str;
        this.c = cslVar;
    }

    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        Object obj2;
        if (this.e != 0) {
            Throwable th = (Throwable) obj;
            if (th instanceof csd) {
                ((cqb) this.b).g(((csd) th).a);
            }
            if (this.a && (obj2 = this.d) != null) {
                int hashCode = ((csl) this.c).a.hashCode();
                if (Build.VERSION.SDK_INT >= 29) {
                    Trace.endAsyncSection(bzo.d((String) obj2), hashCode);
                } else {
                    String d = bzo.d((String) obj2);
                    try {
                        if (bzo.c == null) {
                            bzo.c = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        bzo.c.invoke(null, Long.valueOf(bzo.a), d, Integer.valueOf(hashCode));
                    } catch (Exception e) {
                        bzo.g(e);
                    }
                }
            }
            return mlh.a;
        }
        eeh eehVar = (eeh) obj;
        eehVar.getClass();
        eehVar.a = (lps) this.b;
        eehVar.e = (short) (eehVar.e | 2);
        eehVar.e(null);
        eehVar.g(null);
        eehVar.b = (lqc) this.c;
        short s = eehVar.e;
        eehVar.c = this.a;
        eehVar.d = (Long) this.d;
        eehVar.e = (short) (s | 28);
        eehVar.f(false);
        return mlh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eek(lps lpsVar, lqc lqcVar, boolean z, Long l, int i) {
        super(1);
        this.e = i;
        this.b = lpsVar;
        this.c = lqcVar;
        this.a = z;
        this.d = l;
    }
}
