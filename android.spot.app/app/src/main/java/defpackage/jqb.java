package defpackage;

import dalvik.system.VMStack;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqb extends jpt {
    @Override // defpackage.jpt
    public jns a(Class cls, int i) {
        return jns.a;
    }

    @Override // defpackage.jpt
    public String b(Class cls) {
        boolean z;
        boolean z2;
        z = jqd.a;
        if (z) {
            try {
                if (cls.equals(jqd.p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable unused) {
            }
        }
        z2 = jqd.b;
        if (z2) {
            jrg jrgVar = jrd.a;
            cls.getClass();
            StackTraceElement a = jrd.a.a(cls);
            if (a != null) {
                return a.getClassName();
            }
            return null;
        }
        return null;
    }
}
