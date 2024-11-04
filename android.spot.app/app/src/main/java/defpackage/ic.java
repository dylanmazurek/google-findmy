package defpackage;

import android.R;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ic extends EditText implements bvl, cab {
    private final hw a;
    private final jb b;
    private final caa c;
    private final bnp d;
    private final bfi e;
    private njz f;

    public ic(Context context) {
        this(context, null);
    }

    private final njz d() {
        if (this.f == null) {
            this.f = new njz(this, null);
        }
        return this.f;
    }

    @Override // defpackage.cab
    public final void bJ(ColorStateList colorStateList) {
        this.b.m(colorStateList);
        this.b.e();
    }

    @Override // defpackage.cab
    public final void bK(PorterDuff.Mode mode) {
        this.b.n(mode);
        this.b.e();
    }

    @Override // defpackage.bvl
    public final bur c(bur burVar) {
        return this.c.a(this, burVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hw hwVar = this.a;
        if (hwVar != null) {
            hwVar.a();
        }
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return brh.c(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        bnp bnpVar;
        if (Build.VERSION.SDK_INT < 28 && (bnpVar = this.d) != null) {
            return bnpVar.c();
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] v;
        String[] strArr;
        InputConnection bzfVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jb.s(this, onCreateInputConnection, editorInfo);
        de.d(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (v = bwn.v(this)) != null) {
            if (Build.VERSION.SDK_INT >= 25) {
                editorInfo.contentMimeTypes = v;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", v);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", v);
            }
            njz njzVar = new njz(this);
            amr.p(editorInfo, "editorInfo must be non-null");
            if (Build.VERSION.SDK_INT >= 25) {
                bzfVar = new bze(onCreateInputConnection, njzVar);
            } else {
                if (Build.VERSION.SDK_INT >= 25) {
                    strArr = editorInfo.contentMimeTypes;
                    if (strArr == null) {
                        strArr = bzd.a;
                    }
                } else if (editorInfo.extras == null) {
                    strArr = bzd.a;
                } else {
                    String[] stringArray = editorInfo.extras.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                    if (stringArray == null) {
                        strArr = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                    } else {
                        strArr = stringArray;
                    }
                    if (strArr == null) {
                        strArr = bzd.a;
                    }
                }
                if (strArr.length != 0) {
                    bzfVar = new bzf(onCreateInputConnection, njzVar);
                }
            }
            onCreateInputConnection = bzfVar;
        }
        return this.e.o(onCreateInputConnection);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && bwn.v(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                ij.a(dragEvent, this, activity);
                return true;
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        bum bunVar;
        int i2;
        if (Build.VERSION.SDK_INT < 31 && bwn.v(this) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = R.id.pasteAsPlainText;
                }
            }
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (Build.VERSION.SDK_INT >= 31) {
                    bunVar = new bul(primaryClip, 1);
                } else {
                    bunVar = new bun(primaryClip, 1);
                }
                if (i == 16908322) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                bunVar.c(i2);
                bwn.c(this, bqk.e(bunVar));
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hw hwVar = this.a;
        if (hwVar != null) {
            hwVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hw hwVar = this.a;
        if (hwVar != null) {
            hwVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(brh.d(this, callback));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(bfi.n(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        bnp bnpVar;
        if (Build.VERSION.SDK_INT < 28 && (bnpVar = this.d) != null) {
            bnpVar.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public ic(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.adm.R.attr.editTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mz.a(context);
        mx.d(this, getContext());
        hw hwVar = new hw(this);
        this.a = hwVar;
        hwVar.b(attributeSet, i);
        jb jbVar = new jb(this);
        this.b = jbVar;
        jbVar.g(attributeSet, i);
        jbVar.e();
        this.d = new bnp(this);
        this.c = new caa();
        bfi bfiVar = new bfi(this);
        this.e = bfiVar;
        bfiVar.l(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (bfi.m(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener n = bfi.n(keyListener);
            if (n == keyListener) {
                return;
            }
            super.setKeyListener(n);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }
}
