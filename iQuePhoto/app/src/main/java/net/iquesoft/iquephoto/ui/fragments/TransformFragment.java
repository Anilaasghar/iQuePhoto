package net.iquesoft.iquephoto.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;

import net.iquesoft.iquephoto.R;

import net.iquesoft.iquephoto.mvp.presenters.fragment.TransformPresenter;
import net.iquesoft.iquephoto.mvp.views.fragment.TransformView;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

import static net.iquesoft.iquephoto.core.editor.enums.EditorCommand.TRANSFORM_HORIZONTAL;
import static net.iquesoft.iquephoto.core.editor.enums.EditorCommand.TRANSFORM_STRAIGHTEN;
import static net.iquesoft.iquephoto.core.editor.enums.EditorCommand.TRANSFORM_VERTICAL;

public class TransformFragment extends MvpAppCompatFragment implements TransformView {

    @InjectPresenter
    TransformPresenter presenter;

    private Unbinder mUnbinder;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transform, container, false);

        mUnbinder = ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }

    @OnClick(R.id.transformBackButton)
    void onClickBack() {
        // TODO; editorActivityView.navigateBack(true);
    }

    @OnClick(R.id.transformHorizontalButton)
    void onClickTransformHorizontal() {
        presenter.setupTransform(TRANSFORM_HORIZONTAL);
    }

    @OnClick(R.id.transformStraightenButton)
    void onClickTransformStraighten() {
        presenter.setupTransform(TRANSFORM_STRAIGHTEN);
    }

    @OnClick(R.id.transformVerticalButton)
    void onClickTransformVertical() {
        presenter.setupTransform(TRANSFORM_VERTICAL);
    }
}