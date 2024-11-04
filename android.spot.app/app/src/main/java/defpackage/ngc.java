package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngc {
    public String a;
    public String d;
    public final List f;
    public List g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;

    public ngc() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    private final int d() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        char[] cArr = ngd.a;
        String str = this.a;
        str.getClass();
        return msz.x(str);
    }

    public final ngd a() {
        ArrayList arrayList;
        String str;
        String str2 = this.a;
        if (str2 != null) {
            char[] cArr = ngd.a;
            String y = msz.y(this.b, 0, 0, false, 7);
            String y2 = msz.y(this.c, 0, 0, false, 7);
            String str3 = this.d;
            if (str3 != null) {
                int d = d();
                List list = this.f;
                ArrayList arrayList2 = new ArrayList(mkm.ap(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(msz.y((String) it.next(), 0, 0, false, 7));
                }
                List<String> list2 = this.g;
                String str4 = null;
                if (list2 != null) {
                    arrayList = new ArrayList(mkm.ap(list2));
                    for (String str5 : list2) {
                        if (str5 != null) {
                            str = msz.y(str5, 0, 0, true, 3);
                        } else {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                } else {
                    arrayList = null;
                }
                String str6 = this.h;
                if (str6 != null) {
                    str4 = msz.y(str6, 0, 0, false, 7);
                }
                return new ngd(str2, y, y2, str3, d, arrayList, str4, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public final void b(String str) {
        List list;
        if (str != null) {
            char[] cArr = ngd.a;
            list = msz.z(msz.A(str, 0, 0, " \"'<>#", true, false, true, false, 211));
        } else {
            list = null;
        }
        this.g = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0231, code lost:            if (r1 < 65536) goto L116;     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x006d, code lost:            if (r6 != ':') goto L4;     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x034f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x034b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0076  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.ngd r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngc.c(ngd, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007f, code lost:            if (r1 != defpackage.msz.x(r3)) goto L29;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngc.toString():java.lang.String");
    }
}
