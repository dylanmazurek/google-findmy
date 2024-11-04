package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.adm.R;
import defpackage.ic;
import defpackage.iqh;
import defpackage.isa;
import defpackage.iyb;
import defpackage.iyj;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TextInputEditText extends ic {
    private final Rect a;
    private boolean b;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    private final TextInputLayout d() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean e(TextInputLayout textInputLayout) {
        if (textInputLayout != null && this.b) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout d = d();
        if (e(d) && rect != null) {
            d.getFocusedRect(this.a);
            rect.bottom = this.a.bottom;
        }
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout d = d();
        if (e(d)) {
            boolean globalVisibleRect = d.getGlobalVisibleRect(rect, point);
            if (globalVisibleRect && point != null) {
                point.offset(-getScrollX(), -getScrollY());
                return true;
            }
            return globalVisibleRect;
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout d = d();
        if (d != null && d.k) {
            return d.d();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d = d();
        if (d != null && d.k && super.getHint() == null && iqh.h()) {
            setHint("");
        }
    }

    @Override // defpackage.ic, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        CharSequence charSequence;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout d = d();
            if (d != null) {
                charSequence = d.d();
            } else {
                charSequence = null;
            }
            editorInfo.hintText = charSequence;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout d = d();
        if (Build.VERSION.SDK_INT < 23 && d != null) {
            Editable text = getText();
            CharSequence d2 = d.d();
            boolean isEmpty = TextUtils.isEmpty(text);
            String str2 = "";
            if (TextUtils.isEmpty(d2)) {
                str = "";
            } else {
                str = d2.toString();
            }
            if (!isEmpty) {
                String valueOf = String.valueOf(text);
                if (!TextUtils.isEmpty(str)) {
                    str2 = ", ".concat(String.valueOf(str));
                }
                str2 = String.valueOf(valueOf).concat(str2);
            } else if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            accessibilityNodeInfo.setText(str2);
        }
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout d = d();
        if (e(d) && rect != null) {
            this.a.set(rect.left, rect.top, rect.right, rect.bottom + (d.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.a);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(iyj.a(context, attributeSet, i, 0), attributeSet, i);
        this.a = new Rect();
        TypedArray a = isa.a(context, attributeSet, iyb.b, i, 2132018531, new int[0]);
        this.b = a.getBoolean(0, false);
        a.recycle();
    }
}
