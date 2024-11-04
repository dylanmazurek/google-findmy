package defpackage;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqd extends jpu {
    private static final boolean a = jqc.a();
    private static final boolean b;
    private static final jpt c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new jqb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return jqc.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.jpu
    protected jow e(String str) {
        if (jqg.d.get() != null) {
            return ((jpz) jqg.d.get()).a(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char charAt = str.charAt(length);
                if (charAt == '$') {
                    str = str.replace('$', '.');
                    break;
                }
                if (charAt == '.') {
                    break;
                }
            } else {
                break;
            }
        }
        jqg jqgVar = new jqg(str);
        jqf.a.offer(jqgVar);
        if (jqg.d.get() == null) {
            return jqgVar;
        }
        jqg.e();
        return jqgVar;
    }

    @Override // defpackage.jpu
    protected jpt h() {
        return c;
    }

    @Override // defpackage.jpu
    protected jql j() {
        return jqh.a;
    }

    @Override // defpackage.jpu
    protected String m() {
        return "platform: Android";
    }
}
