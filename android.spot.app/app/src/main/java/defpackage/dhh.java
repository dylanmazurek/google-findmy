package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhh {
    public final String a;
    public final long[] b;
    File[] c;
    File[] d;
    public boolean e;
    public dhg f;
    final /* synthetic */ dhi g;

    public dhh(dhi dhiVar, String str) {
        this.g = dhiVar;
        this.a = str;
        int i = dhiVar.d;
        this.b = new long[i];
        this.c = new File[i];
        this.d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < dhiVar.d; i2 = 1) {
            sb.append(0);
            this.c[0] = new File(dhiVar.a, sb.toString());
            sb.append(".tmp");
            this.d[0] = new File(dhiVar.a, sb.toString());
            sb.setLength(length);
        }
    }

    public static final IOException e(String[] strArr) {
        throw new IOException("unexpected journal line: ".concat(String.valueOf(Arrays.toString(strArr))));
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            long[] jArr = this.b;
            if (i < jArr.length) {
                long j = jArr[0];
                sb.append(' ');
                sb.append(j);
                i = 1;
            } else {
                return sb.toString();
            }
        }
    }

    public final File c() {
        return this.c[0];
    }

    public final File d() {
        return this.d[0];
    }
}
