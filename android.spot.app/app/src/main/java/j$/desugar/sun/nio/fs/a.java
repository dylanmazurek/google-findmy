package j$.desugar.sun.nio.fs;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes2.dex */
final class a {
    private HashSet a;
    private HashMap b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.desugar.sun.nio.fs.a, java.lang.Object] */
    public static a b(HashSet hashSet, String[] strArr) {
        ?? obj = new Object();
        ((a) obj).a = new HashSet();
        ((a) obj).b = new HashMap();
        for (String str : strArr) {
            if (str.equals("*")) {
                ((a) obj).c = true;
            } else if (hashSet.contains(str)) {
                ((a) obj).a.add(str);
            } else {
                throw new IllegalArgumentException("'" + str + "' not recognized");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Object obj, String str) {
        this.b.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(String str) {
        if (!this.c && !this.a.contains(str)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map d() {
        return Collections.unmodifiableMap(this.b);
    }
}
