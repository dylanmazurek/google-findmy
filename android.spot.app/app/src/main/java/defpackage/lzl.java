package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzl {
    public final boolean a;
    public final Object b;

    public lzl(Object obj) {
        this.b = obj;
        this.a = false;
    }

    public final jyz a(Callable callable, Executor executor) {
        return new jxu((jih) this.b, this.a, executor, callable);
    }

    public final jyz b(jxc jxcVar, Executor executor) {
        return new jxu((jih) this.b, this.a, executor, jxcVar);
    }

    public final jyz c(Runnable runnable, Executor executor) {
        return a(new fcz(runnable, 3), executor);
    }

    public final boolean d(CharSequence charSequence, int i) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            if (this.b != null) {
                char c = 2;
                for (int i2 = 0; i2 < i && c == 2; i2++) {
                    byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                    if (directionality != 0) {
                        if (directionality != 1 && directionality != 2) {
                            switch (directionality) {
                                case 14:
                                case 15:
                                    break;
                                case 16:
                                case 17:
                                    break;
                                default:
                                    c = 2;
                                    break;
                            }
                        }
                        c = 0;
                    }
                    c = 1;
                }
                if (c == 0) {
                    return true;
                }
                if (c == 1) {
                    return false;
                }
            }
            return this.a;
        }
        throw new IllegalArgumentException();
    }

    public lzl(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public lzl(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public lzl(boolean z, jis jisVar) {
        this.a = z;
        this.b = jisVar;
    }
}
