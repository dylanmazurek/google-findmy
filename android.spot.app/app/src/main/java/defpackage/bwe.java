package defpackage;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bwe {
    public static int a(View view) {
        int importantForAutofill;
        importantForAutofill = view.getImportantForAutofill();
        return importantForAutofill;
    }

    static int b(View view) {
        int nextClusterForwardId;
        nextClusterForwardId = view.getNextClusterForwardId();
        return nextClusterForwardId;
    }

    static View c(View view, View view2, int i) {
        View keyboardNavigationClusterSearch;
        keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i);
        return keyboardNavigationClusterSearch;
    }

    public static AutofillId d(View view) {
        AutofillId autofillId;
        autofillId = view.getAutofillId();
        return autofillId;
    }

    static void e(View view, Collection collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    static void f(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    static void g(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    public static void h(View view, int i) {
        view.setImportantForAutofill(i);
    }

    static void i(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    static void j(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    static void k(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    static boolean l(View view) {
        boolean hasExplicitFocusable;
        hasExplicitFocusable = view.hasExplicitFocusable();
        return hasExplicitFocusable;
    }

    static boolean m(View view) {
        boolean isFocusedByDefault;
        isFocusedByDefault = view.isFocusedByDefault();
        return isFocusedByDefault;
    }

    static boolean n(View view) {
        boolean isImportantForAutofill;
        isImportantForAutofill = view.isImportantForAutofill();
        return isImportantForAutofill;
    }

    static boolean o(View view) {
        boolean isKeyboardNavigationCluster;
        isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
        return isKeyboardNavigationCluster;
    }

    static boolean p(View view) {
        boolean restoreDefaultFocus;
        restoreDefaultFocus = view.restoreDefaultFocus();
        return restoreDefaultFocus;
    }

    public void q(ckd ckdVar) {
    }
}
