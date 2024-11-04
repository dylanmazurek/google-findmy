package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwi {
    static int a(View view) {
        int importantForContentCapture;
        importantForContentCapture = view.getImportantForContentCapture();
        return importantForContentCapture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence b(View view) {
        CharSequence stateDescription;
        stateDescription = view.getStateDescription();
        return stateDescription;
    }

    static void c(View view, int i) {
        view.setImportantForContentCapture(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    static boolean e(View view) {
        boolean isImportantForContentCapture;
        isImportantForContentCapture = view.isImportantForContentCapture();
        return isImportantForContentCapture;
    }

    public static final String f(String str, String str2) {
        return "room_table_modification_trigger_" + str + '_' + str2;
    }
}
