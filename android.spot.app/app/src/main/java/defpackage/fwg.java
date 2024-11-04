package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwg {
    public static final fwg a = new fwg();
    private Pattern[] b = new Pattern[0];
    private String[] c = new String[0];

    private fwg() {
    }

    public final synchronized String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            while (true) {
                Pattern[] patternArr = this.b;
                if (i < patternArr.length) {
                    str = patternArr[i].matcher(str).replaceAll(this.c[i]);
                    i++;
                } else {
                    return str;
                }
            }
        } else {
            return null;
        }
    }

    public final synchronized void b(String[] strArr, String[] strArr2) {
        boolean z;
        int length = strArr.length;
        if (length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        fma.aF(z);
        this.b = new Pattern[length];
        this.c = strArr2;
        for (int i = 0; i < strArr.length; i++) {
            this.b[i] = Pattern.compile(strArr[i]);
        }
    }
}
