package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nar {
    private static final int a = c(Throwable.class, -1);
    private static final nal b;

    static {
        nal nalVar;
        try {
            if (nas.a) {
                nalVar = nbp.a;
            } else {
                nalVar = naf.a;
            }
        } catch (Throwable unused) {
            nalVar = nbp.a;
        }
        b = nalVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable a(Throwable th) {
        Object n;
        if (th instanceof msq) {
            try {
                n = ((msq) th).a();
            } catch (Throwable th2) {
                n = mjo.n(th2);
            }
            if (true == (n instanceof mkx)) {
                n = null;
            }
            return (Throwable) n;
        }
        return (Throwable) b.a(th.getClass()).a(th);
    }

    public static final moh b(Class cls) {
        Object obj;
        int i;
        mkw mkwVar;
        cka ckaVar = cka.s;
        if (a != c(cls, 0)) {
            return ckaVar;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        int length = constructors.length;
        ArrayList arrayList = new ArrayList(length);
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i2];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 != 0) {
                if (length2 != 1) {
                    if (length2 != 2) {
                        mkwVar = new mkw(null, -1);
                    } else if (amr.i(parameterTypes[0], String.class) && amr.i(parameterTypes[1], Throwable.class)) {
                        mkwVar = new mkw(new naq(new eeo(constructor, 19), 2), 3);
                    } else {
                        mkwVar = new mkw(null, -1);
                    }
                } else {
                    Class<?> cls2 = parameterTypes[0];
                    if (amr.i(cls2, String.class)) {
                        mkwVar = new mkw(new naq(new eeo(constructor, 20), 2), 2);
                    } else if (amr.i(cls2, Throwable.class)) {
                        mkwVar = new mkw(new naq(new naq(constructor, 1), 2), 1);
                    } else {
                        mkwVar = new mkw(null, -1);
                    }
                }
            } else {
                mkwVar = new mkw(new naq(new naq(constructor, 0), 2), 0);
            }
            arrayList.add(mkwVar);
            i2++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((mkw) obj).b).intValue();
                while (true) {
                    Object next = it.next();
                    int intValue2 = ((Number) ((mkw) next).b).intValue();
                    if (intValue < intValue2) {
                        i = intValue2;
                    } else {
                        i = intValue;
                    }
                    if (intValue < intValue2) {
                        obj = next;
                    }
                    if (!it.hasNext()) {
                        break;
                    }
                    intValue = i;
                }
            }
        }
        mkw mkwVar2 = (mkw) obj;
        if (mkwVar2 != null) {
            moh mohVar = (moh) mkwVar2.a;
            if (mohVar == null) {
                return ckaVar;
            }
            return mohVar;
        }
        return ckaVar;
    }

    private static final int c(Class cls, int i) {
        Object n;
        moz.c(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                n = mjo.n(th);
            }
        } while (cls != null);
        n = Integer.valueOf(i2);
        Object valueOf = Integer.valueOf(i);
        if (true == (n instanceof mkx)) {
            n = valueOf;
        }
        return ((Number) n).intValue();
    }
}
