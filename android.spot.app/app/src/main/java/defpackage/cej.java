package defpackage;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class cej {
    static final cej a = new cej();
    private final Map c = new HashMap();
    public final Map b = new HashMap();

    private static final void d(Map map, cei ceiVar, cev cevVar, Class cls) {
        cev cevVar2 = (cev) map.get(ceiVar);
        if (cevVar2 != null && cevVar != cevVar2) {
            throw new IllegalArgumentException("Method " + ceiVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + cevVar2 + ", new value " + cevVar);
        }
        if (cevVar2 == null) {
            map.put(ceiVar, cevVar);
        }
    }

    public final ceh a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).b.entrySet()) {
                d(hashMap, (cei) entry.getKey(), (cev) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length > 0) {
                    if (cfc.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                cev a2 = onLifecycleEvent.a();
                if (length > 1) {
                    if (cev.class.isAssignableFrom(parameterTypes[1])) {
                        if (a2 == cev.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (length <= 2) {
                    d(hashMap, new cei(i, method), a2, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        ceh cehVar = new ceh(hashMap);
        this.c.put(cls, cehVar);
        this.b.put(cls, Boolean.valueOf(z));
        return cehVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ceh b(Class cls) {
        ceh cehVar = (ceh) this.c.get(cls);
        if (cehVar != null) {
            return cehVar;
        }
        return a(cls, null);
    }

    public final Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
