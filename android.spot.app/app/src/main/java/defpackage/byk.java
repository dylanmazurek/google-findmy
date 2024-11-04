package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byk {
    public static AccessibilityNodeInfo.ExtraRenderingInfo a(AccessibilityNodeInfo accessibilityNodeInfo) {
        AccessibilityNodeInfo.ExtraRenderingInfo extraRenderingInfo;
        extraRenderingInfo = accessibilityNodeInfo.getExtraRenderingInfo();
        return extraRenderingInfo;
    }

    public static bym b(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
        AccessibilityNodeInfo.CollectionItemInfo.Builder heading;
        AccessibilityNodeInfo.CollectionItemInfo.Builder columnIndex;
        AccessibilityNodeInfo.CollectionItemInfo.Builder rowIndex;
        AccessibilityNodeInfo.CollectionItemInfo.Builder columnSpan;
        AccessibilityNodeInfo.CollectionItemInfo.Builder rowSpan;
        AccessibilityNodeInfo.CollectionItemInfo.Builder selected;
        AccessibilityNodeInfo.CollectionItemInfo.Builder rowTitle;
        AccessibilityNodeInfo.CollectionItemInfo.Builder columnTitle;
        AccessibilityNodeInfo.CollectionItemInfo build;
        heading = new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z);
        columnIndex = heading.setColumnIndex(i);
        rowIndex = columnIndex.setRowIndex(i2);
        columnSpan = rowIndex.setColumnSpan(i3);
        rowSpan = columnSpan.setRowSpan(i4);
        selected = rowSpan.setSelected(z2);
        rowTitle = selected.setRowTitle(str);
        columnTitle = rowTitle.setColumnTitle(str2);
        build = columnTitle.build();
        return new bym(build);
    }

    public static byn c(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
        AccessibilityNodeInfo child;
        child = accessibilityNodeInfo.getChild(i, i2);
        return byn.c(child);
    }

    public static byn d(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        AccessibilityNodeInfo parent;
        parent = accessibilityNodeInfo.getParent(i);
        return byn.c(parent);
    }

    public static String e(Object obj) {
        String columnTitle;
        columnTitle = ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        return columnTitle;
    }

    public static String f(Object obj) {
        String rowTitle;
        rowTitle = ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        return rowTitle;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        String uniqueId;
        uniqueId = accessibilityNodeInfo.getUniqueId();
        return uniqueId;
    }

    public static void h(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setTextSelectable(z);
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }

    public static boolean j(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean isTextSelectable;
        isTextSelectable = accessibilityNodeInfo.isTextSelectable();
        return isTextSelectable;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02e3 A[Catch: all -> 0x030d, TryCatch #2 {all -> 0x030d, all -> 0x02f3, blocks: (B:45:0x019a, B:50:0x01b3, B:51:0x01b8, B:53:0x01be, B:60:0x01ca, B:63:0x01db, B:99:0x02d0, B:101:0x02e3, B:105:0x02d4, B:108:0x02f4, B:109:0x02f7, B:113:0x02fc, B:65:0x01e5, B:71:0x020a, B:72:0x0216, B:74:0x021c, B:81:0x0227, B:84:0x023f, B:88:0x025b, B:89:0x027c, B:91:0x0282, B:93:0x0292, B:94:0x02b1, B:96:0x02b7, B:98:0x02c7), top: B:44:0x019a }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.cjt k(defpackage.ddh r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byk.k(ddh, java.lang.String):cjt");
    }
}
