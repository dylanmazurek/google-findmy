package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imr {
    private static imr e;
    public int a;
    public final Object b;
    public final Object c;
    public Object d;

    public imr(String str, imp... impVarArr) {
        this.b = str;
        this.c = impVarArr;
    }

    public static synchronized imr d(Context context) {
        imr imrVar;
        synchronized (imr.class) {
            if (e == null) {
                frx frxVar = fqv.a;
                e = new imr(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new fmd("MessengerIpcClient"))));
            }
            imrVar = e;
        }
        return imrVar;
    }

    public final synchronized int a() {
        int i;
        i = this.a;
        this.a = i + 1;
        return i;
    }

    public final fxs b(int i, Bundle bundle) {
        return c(new fgf(a(), i, bundle));
    }

    public final synchronized fxs c(fgg fggVar) {
        if (!((fge) this.d).e(fggVar)) {
            fge fgeVar = new fge(this);
            this.d = fgeVar;
            fge fgeVar2 = fgeVar;
            fgeVar.e(fggVar);
        }
        return (fxs) fggVar.d.a;
    }

    public final Object e(int i) {
        if (i < this.a && i >= 0) {
            return ((Object[]) this.d)[i];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.a);
    }

    public final void f() {
        int i = this.a;
        if (i == 0) {
            return;
        }
        Arrays.fill((Object[]) this.d, 0, i, (Object) null);
        this.a = 0;
        ((fg) this.c).b(0, i);
    }

    public final int g(Object obj, Object[] objArr, int i, int i2) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        int i3 = 0;
        while (i3 < i) {
            int i4 = (i3 + i) / 2;
            Object obj2 = objArr[i4];
            int compare = ((fg) this.c).compare(obj2, obj);
            if (compare < 0) {
                i3 = i4 + 1;
            } else {
                if (compare == 0) {
                    equals = ((Integer) obj2).equals(obj);
                    if (!equals) {
                        int i5 = i4 - 1;
                        while (i5 >= i3) {
                            Object obj3 = ((Object[]) this.d)[i5];
                            if (((fg) this.c).compare(obj3, obj) == 0) {
                                equals3 = ((Integer) obj3).equals(obj);
                                if (equals3) {
                                    break;
                                }
                                i5--;
                            } else {
                                break;
                            }
                        }
                        i5 = i4 + 1;
                        while (i5 < i) {
                            Object obj4 = ((Object[]) this.d)[i5];
                            if (((fg) this.c).compare(obj4, obj) == 0) {
                                equals2 = ((Integer) obj4).equals(obj);
                                if (equals2) {
                                    break;
                                }
                                i5++;
                            } else {
                                break;
                            }
                        }
                        i5 = -1;
                        if (i2 == 1 && i5 == -1) {
                            return i4;
                        }
                        return i5;
                    }
                    return i4;
                }
                i = i4;
            }
        }
        if (i2 != 1) {
            return -1;
        }
        return i3;
    }

    public imr(Class cls, fg fgVar) {
        this.b = cls;
        this.d = (Object[]) Array.newInstance((Class<?>) cls, 10);
        this.c = fgVar;
        this.a = 0;
    }

    public imr(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new fge(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }
}
