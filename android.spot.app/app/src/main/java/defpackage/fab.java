package defpackage;

import android.content.ContentResolver;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fab {
    public static final Pattern a = Pattern.compile(" +");
    private static final Pattern d = Pattern.compile("\\W");
    private static fab e = new fab(new ezz[0]);
    private static Object f;
    public final ezz[] b;
    public final Pattern c;

    public fab(ezz[] ezzVarArr) {
        Arrays.sort(ezzVarArr);
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < ezzVarArr.length; i++) {
            if (i > 0) {
                sb.append(")|(");
            }
            sb.append(d.matcher(ezzVarArr[i].c).replaceAll("\\\\$0"));
        }
        sb.append(")");
        this.c = Pattern.compile(sb.toString());
        this.b = ezzVarArr;
    }

    public static synchronized fab a(ContentResolver contentResolver) {
        Object obj;
        Map treeMap;
        synchronized (fab.class) {
            fyv fyvVar = fyo.a;
            synchronized (fyvVar) {
                fyvVar.b(contentResolver);
                obj = fyvVar.e;
            }
            if (obj == f) {
                return e;
            }
            String[] strArr = {"url:"};
            try {
                fma fmaVar = fyo.a.f;
                final int i = 0;
                treeMap = fma.k(contentResolver, strArr, new fyt() { // from class: fyr
                    @Override // defpackage.fyt
                    public final Map a(int i2) {
                        if (i != 0) {
                            return new HashMap(i2, 1.0f);
                        }
                        return new TreeMap();
                    }
                });
            } catch (fyu unused) {
                treeMap = new TreeMap();
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : treeMap.entrySet()) {
                try {
                    String substring = ((String) entry.getKey()).substring(4);
                    String str = (String) entry.getValue();
                    if (str != null && str.length() != 0) {
                        arrayList.add(new ezz(substring, str));
                    }
                } catch (faa e2) {
                    Log.e("UrlRules", "Invalid rule from Gservices", e2);
                }
            }
            fab fabVar = new fab((ezz[]) arrayList.toArray(new ezz[arrayList.size()]));
            e = fabVar;
            f = obj;
            return fabVar;
        }
    }
}
