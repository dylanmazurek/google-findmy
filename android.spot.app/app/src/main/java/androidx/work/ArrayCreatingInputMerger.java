package androidx.work;

import defpackage.amr;
import defpackage.box;
import defpackage.cpn;
import defpackage.cpv;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends cpv {
    @Override // defpackage.cpv
    public final cpn a(List list) {
        Class<?> cls;
        Object newInstance;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((cpn) it.next()).c().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null || (cls = value.getClass()) == null) {
                    cls = String.class;
                }
                Object obj = hashMap.get(str);
                if (obj == null) {
                    if (cls.isArray()) {
                        value.getClass();
                    } else {
                        newInstance = Array.newInstance(cls, 1);
                        Array.set(newInstance, 0, value);
                        newInstance.getClass();
                        value = newInstance;
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (amr.i(cls2, cls)) {
                        value.getClass();
                        int length = Array.getLength(obj);
                        Class<?> cls3 = obj.getClass();
                        int length2 = Array.getLength(value);
                        Class<?> componentType = cls3.getComponentType();
                        componentType.getClass();
                        Object newInstance2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newInstance2, 0, length);
                        System.arraycopy(value, 0, newInstance2, length, length2);
                        newInstance2.getClass();
                        value = newInstance2;
                    } else if (amr.i(cls2.getComponentType(), cls)) {
                        int length3 = Array.getLength(obj);
                        newInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newInstance, 0, length3);
                        Array.set(newInstance, length3, value);
                        newInstance.getClass();
                        value = newInstance;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                hashMap.put(str, value);
            }
        }
        box.k(hashMap, linkedHashMap);
        return box.i(linkedHashMap);
    }
}
